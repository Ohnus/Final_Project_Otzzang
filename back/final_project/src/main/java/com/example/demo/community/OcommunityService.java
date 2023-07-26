package com.example.demo.community;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.member.Omember;

@Service
public class OcommunityService {
	@Autowired
	// private OmemberService service; -> member id 검색 시 필요
	private OcommunityDao dao;

	// dto vo 변경하기
	private Object change(Object obj) {
		// 매개변수의 클래스를 확인한다.
		if (obj instanceof Ocommunity) {
			// 만약 vo라면 temp에 vo클래스로 값을 넣어놓는다.
			Ocommunity temp = (Ocommunity) obj;
			ArrayList<String> tagList = new ArrayList<>();
			
			// vo에서 dto로 갈 때 vue에서 이용하기 쉽게 ArrayList로 담아서 만든다.
			String tag = temp.getTag();
			String[] tagArr = tag.split("#");
			for(String tagTemp : tagArr) {
				tagList.add(tagTemp);
			}
			// vo의 값들을 dto 생성자를 이용하여 새로 생긴 dto에 값을 기입해준 후 리턴한다.
			return new OcommunityDto(temp.getCommnum(), temp.getMemnum(), temp.getTag(), temp.getImg1(), temp.getImg2(),
					temp.getImg3(), temp.getBtnlike(),tagList,false,false);
		} else {
			// 반대로 한다.
			OcommunityDto temp = (OcommunityDto) obj;
			return new Ocommunity(temp.getCommnum(), temp.getMemnum(), temp.getTag(), temp.getImg1(), temp.getImg2(),
					temp.getImg3(), temp.getBtnlike());
		}
	}

	// ArrayList Vo -> Dto 로 변경하기
	private ArrayList<OcommunityDto> changeList(ArrayList<Ocommunity> list) {
		// 값을 넣은 후 리턴할 빈 dto list를 선언 및 생성한다.
		ArrayList<OcommunityDto> listDto = new ArrayList<>();
		for (Ocommunity vo : list) {
			// 입력 값으로 받은 vo list에 있는 vo들을 dto로 변환한다.
			OcommunityDto dto = (OcommunityDto) change(vo);
			// method가 실행될 때 선언했던 dto list에 변경된 dto들을 삽입한다.
			listDto.add(dto);
		}
		// 완성된 dto list를 리턴한다.
		return listDto;
	}

	// 게시글 등록.
	public OcommunityDto save(OcommunityDto dto) {
		Ocommunity comm = (Ocommunity) change(dto);
		OcommunityDto result = (OcommunityDto) change(dao.save(comm));
		return result;
	}

	// 게시글 전체검색
	public ArrayList<OcommunityDto> getAll() {
		ArrayList<Ocommunity> list = (ArrayList<Ocommunity>) dao.findAll();
		ArrayList<OcommunityDto> list2 = changeList(list);
		return list2;
	}

	// 회원번호로 검색
	public ArrayList<OcommunityDto> getByMemnum(int memnum) {
		ArrayList<Ocommunity> list = (ArrayList<Ocommunity>) dao.findByMemnum(memnum);
		ArrayList<OcommunityDto> list2 = changeList(list);
		return list2;
	}

	// 게시글 번호로 검색
	public OcommunityDto getByCommnum(int commnum) {
		Ocommunity entity = dao.findById(commnum).orElse(null);
		return (OcommunityDto) change(entity);
	}

	// findBy컬럼명Like(컬럼타입)
	// 태그별 검색
	public ArrayList<OcommunityDto> getByTag(String tag) {
		ArrayList<Ocommunity> list = (ArrayList<Ocommunity>) dao.findByTagLike("%" + tag + "%");
		ArrayList<OcommunityDto> list2 = changeList(list);
		return list2;
	}

	// 좋아요 up
	// btnlike = 좋아요 / num = 게시물 번호.
	public void upBtn(int commnum) {
		dao.upBtn(commnum);
	}

	// 좋아요 down
	public void downBtn(int commnum) {
		dao.downBtn(commnum);
	}

	// 게시글 삭제
	public void delOcommunity(int commnum) {
		dao.deleteById(commnum);
	}

	// 게시글 한개 검색
	public OcommunityDto getByPost(int commnum) {
		Ocommunity vo = dao.findById(commnum).orElse(null);
		if (vo == null) {
			return null;
		}
		OcommunityDto dto = (OcommunityDto) change(vo);
		return dto;
	}
}
