<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
<h1>Hello Insert</h1>
 <div id="board_write">
		<h4>글을 작성하는 공간입니다.</h4>
			<div id="write_area">
				<form enctype="multipart/form-data" action="boardInsert.do" method="post">
					<div id="in_title">
						<textarea name="title" id="utitle" rows="2" cols="75" placeholder="제목" maxlength="100" required></textarea>
					</div>
 
					<div class="wi_line"></div>
					<div id="in_content">
						<textarea name="content" id="ucontent" placeholder="내용" rows="30" cols="75"  required></textarea>
					</div>
					<div class="bt_se">
						<button type="submit">글 작성</button>
					</div>
				</form>
			</div>
		</div>
		<br>
<button onclick="getList()">목록으로</button>
</body>
