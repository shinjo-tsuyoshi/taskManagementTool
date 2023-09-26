
// メイン レイアウト読み込み部分取得
const layout = document.getElementById("mainLayout");

// URL保存用 箱
let urlKeep = "";

/* メイン レイアウトの設定 */
function onChangeMainLayout(element){
    let idName = element.id;
    let url = "";

    console.log("menu : " + idName);

    switch(idName){
        case "addition":
            url = "taskManagement/addition";
            break;
        case "todo":
            url = "../todo/todo.html";
            break;

        case "todayTask":
            url = "../todayTask/todayTask.html";
            break;

        case "ganttChart":
            url = "../ganttChart/ganttChart.html";
            break;

        case "edit":
            url = "../edit/edit.html";
            break;

        case "mainLogoText":
            url = "/taskManagement";
            break;

        default:
            url = idName;
    }
//    layout.setAttribute('src', url);
	alert(url);
	window.location.href = url;
}

function onChangeBtnLayout(element){
    let idName = element.id;
    console.log("menu : " + idName);

    switch(idName){
        case "edit":
            urlKeep = "../edit/edit.html";
            break;
        case "todo":
            urlKeep = "../todo/todo.html";
            break;
        case "addBtn":
            urlKeep = "../todo/todo.html";
            break;
    }
    window.location.href = urlKeep;
}

