package com.uragil.nubato.dao;

import java.util.ArrayList;

import com.uragil.nubato.dto.FBoardDto;
import com.uragil.nubato.dto.FileDto;

public interface IDao {

	
	public void fbwriteDao(String fbname, String fbtitle, String fbcontent, String fbid);//자유게시판 글쓰기
	public ArrayList<FBoardDto> fblistDao();//자유게시판 리스트 가져오기
	public int fblistcountDao();//자유게시판 리스트 글 개수 가져오기
	public void fbhitDao(String fbnum);//자유게시판 조회수 증가
	public FBoardDto fbviewDao(String fbnum);//자유게시판 글 보기
	public ArrayList<FBoardDto> fbTitleSearchlistDao(String keyword);//자유게시판 제목에서 검색한 결과 리스트 가져오기
	public ArrayList<FBoardDto> fbContentSearchlistDao(String keyword);//자유게시판 내용에서 검색한 결과 리스트 가져오기
	public ArrayList<FBoardDto> fbWriterSearchlistDao(String keyword);//자유게시판 글쓴이에서 검색한 결과 리스트 가져오기
	public void fbdeleteDao(String fbnum);//자유게시판 글 삭제
	
	
	public void fbfileInsertDao(int bno, String fileName, String fileOriName, String fileUrl, String fileExtension);
	//파일 우너본이름, 변경된이름,파일이 첨부된 게시글 번호, 파일 경로를 DB에 저장	
	public FileDto fbfileInfoDao(String bno);
	//member 용 dao
	
}