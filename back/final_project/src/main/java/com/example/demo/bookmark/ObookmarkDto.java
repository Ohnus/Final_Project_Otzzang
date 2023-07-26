package com.example.demo.bookmark;

import com.example.demo.community.Ocommunity;
import com.example.demo.member.Omember;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class ObookmarkDto {

	private int bmnum;
	private Ocommunity commnum;
	private Omember memnum;

}
