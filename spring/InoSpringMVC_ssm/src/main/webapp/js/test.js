window.onload = function () {
    updateZJ();
    //当页面加载完成，需要绑定事件
    var fruitTB1 = document.getElementById("tb1_fruit");
    //获取表格中所有的行
    var rows = fruitTB1.rows;
    for (var i = 1; i < rows.length - 1; i++) {
        var tr = rows[i];
        //1.绑定鼠标悬浮设置背景颜色时间
        tr.onmouseover = showBGColor;
        tr.onmouseout = clearBGColor;
        // 获取tr这一行的所有单元格
        var cells = tr.cells;
        var priceID = cells[1];
        //2.绑定鼠标悬浮单价时手势事件
        priceID.onmouseover = showHand;
        //3.绑定鼠标点击事件是手势事件
        priceID.onclick = editPrice;

        //绑定删除小图标的点击事件
        var img = cells[4].firstChild;
        if (img && img.tagName == "IMG") {
            //绑定点击事件
            img.onclick = delFruit;
        }

    }
}

function delFruit() {
    if (event && event.srcElement && event.srcElement.tagName === "IMG") {
        // alert表示弹出一个对话框，只有确认按钮
        // confirm表示但出一个对话框，有确定和取消，点击确定返回true,否侧返回false
        if (window.confirm("是否删除当前行")) {
            var img = event.srcElement;
            var tr = img.parentElement.parentElement;
            var fruitTb1 = document.getElementById("tb1_fruit");
            fruitTb1.deleteRow(tr.rowIndex);
            updateZJ();
        }
    }
}

function editPrice() {
    if (event && event.srcElement && event.srcElement.tagName === "TD") {
        var priceID = event.srcElement;
        //判断当前priceID有子节点，且子节点是文本
        if (priceID.firstChild && priceID.firstChild.nodeType == 3) {
            var oldPrice = priceID.innerText;
            // innerHtml标识设置当前节点内部HTML
            priceID.innerHTML = "<input type='text' size='4'>";
            var input = priceID.firstChild;
            if (input.tagName == "INPUT") {
                input.value = oldPrice;
                input.select();
                // 4.绑定输入框失去焦点时间，失去焦点，更新单价
                input.onblur = updatePrice;
                // 在输入框绑定键摁下的事件，保证用户输入的是数字
                input.onkeydown = ckInput;
            }
        }
    }
}

//检验键盘按的值是数字
function ckInput() {
    var kc = event.keyCode;
    //console.log(kc);
    //0~9 是 48~57  删除键是 8  回车键是 13
    if (!(kc >= 48 && kc <= 57) || kc == 8 || kc == 13) {
        event.returnValue = false;
    }
    if (kc == 13) {
        event.srcElement.blur();
    }
}

function updatePrice() {
    if (event && event.srcElement && event.srcElement.tagName === "INPUT") {
        var input = event.srcElement;
        var newPrice = input.value;
        //input 节点的父节点是td
        var priceTD = input.parentElement;
        priceTD.innerText = newPrice;
    }
}

//更新指定行小计
function updateXJ(tr) {
    if (tr && tr.tagName == "TR") {
        var tds = tr.cells;
        var price = tds[1].innerText;
        var count = tds[2].innerText;
        // 数据为字符串，需要转换
        tds[3].innerText = parseInt(price) * parseInt(count);
        updateZJ();

    }
}

function updateZJ() {
    var fruitTb1 = document.getElementById("tb1_fruit");
    var rows = fruitTb1.rows;
    var sum = 0;
    for (var i = 1; i < rows.length - 1; i++) {
        var tr = rows[i];
        var string = tr.cells[3].innerText;
        var xj = parseInt(string);
        sum += xj;
    }
    rows[rows.length - 1].cells[1].innerText = sum;
}

//当鼠标悬浮时，展示背景颜色
function showBGColor() {
    //event 当前发生的事件
    //alert(event.srcElement);
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        //获取td的父元素--TR
        var tr = td.parentElement;
        tr.style.backgroundColor = "red";
        //tr.cells标识获取tr中的所有单元格
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "white";
        }
    }
}

//当鼠标不悬浮时，隐藏背景颜色
function clearBGColor() {
    //event 当前发生的事件
    //alert(event.srcElement)
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        //获取td的父元素--TR
        var tr = td.parentElement;
        tr.style.backgroundColor = "white";
        //tr.cells标识获取tr中的所有单元格
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "red";
        }
    }
}

function showHand() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        td.style.cursor = "hand";
    }
}