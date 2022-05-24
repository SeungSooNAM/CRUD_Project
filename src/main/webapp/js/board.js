/**
 * 
 */
$(document).ready(function() {
	getList();
});

/* 로드 작성 */
function getList() {
	
	$("#area").load("board/freeboardList.do");
}

function insert() {
	$("#area").load("board/freeboardWrite.do");
}

function update() {
	$("#area").load();
}