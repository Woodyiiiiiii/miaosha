package com.miaoshaproject.response;

/**
 * 用户的User Model类是JSON数据类型，前端获得用户信息的返回后
 * 是很难处理的。比如，如果一个实例是空，返回的页面是SpringBoot
 * 自带的错误500页面，前端无法下手，此时我们需要统一返回类型
 * 包括实例数据部分data和状态status信息
 */
public class CommonReturnType {

    /* 表明对应请求的返回处理结果——success/fail */
    private String status;

    /* success——data内返回前端需要的JSON数据 */
    /* fail——data内使用通用的错误码格式 */
    private Object data;

    // 定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    // 函数重载
    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
