/**
 * 
 */
$(document).ready(function() {
	getList();
});

function getList() {
	
	$("#area").load("boardList.do");
}

function insert() {
	$("#area").load("boardInsert.do");
}

function update() {
	$("#area").load("boardUpdate.do");
}