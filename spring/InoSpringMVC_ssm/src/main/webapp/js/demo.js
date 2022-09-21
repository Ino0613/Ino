//alert("Test");
// document.write("Hello JS ");
// console.log("Hello console");
var test = 20;
test = "张三";

/*
    var:
        1. 作用域:全局变量
        2. 变量可以重复定义
 */

//alert(test);

/*
    let:
        1. 作用域:局部变量
        2. 变量不能重复定义
 */
{
    let age = 30;
}
//alert(age);

/*
    const:
        1. 常量
        2. 不能改变
 */
// {
//     const PI = 3.14;
//     //PI = 3;
// }

{
    /*
        ==:
            1. 判断类型是否一样，如果不一样，则进行类型转换
            2. 再去比较其值

        ===:
            1. 判断类型是否一样，如果不一样，直接返回false
            2. 再去比较其值
     */
    var a1 = 20;
    var a2 = "20";
    alert(a1 === a2);

    var a3 = +"20";
    alert(parseInt(a3) + 1);
}
