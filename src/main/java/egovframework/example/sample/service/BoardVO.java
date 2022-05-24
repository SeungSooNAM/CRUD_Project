package egovframework.example.sample.service;

import java.util.Date;

public class BoardVO {

	private int boardNo;
	private String boardType;
	private String writer;
	private String title;
	private String content;
	private int readCount;
	private Date regdate;
	private String files;
	private String filesPath;
	private String fileOriginalName;
	
	public BoardVO () {}

	public BoardVO(int boardNo, String boardType, String writer, String title, String content, int readCount,
			Date regdate, String files, String filesPath, String fileOriginalName) {
		super();
		this.boardNo = boardNo;
		this.boardType = boardType;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.regdate = regdate;
		this.files = files;
		this.filesPath = filesPath;
		this.fileOriginalName = fileOriginalName;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getFilesPath() {
		return filesPath;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", boardType=" + boardType + ", writer=" + writer + ", title=" + title
				+ ", content=" + content + ", readCount=" + readCount + ", regdate=" + regdate + ", files=" + files
				+ ", filesPath=" + filesPath + ", fileOriginalName=" + fileOriginalName + "]";
	}
	
}
