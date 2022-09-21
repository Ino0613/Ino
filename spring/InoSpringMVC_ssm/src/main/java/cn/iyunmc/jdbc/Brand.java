package cn.iyunmc.jdbc;

public class Brand {

    // id 主键
    private int id;
    // 品牌名称
    private String brand_name;
    // 企业名称
    private String company_name;
    // 排序字段
    private String ordered;
    // 描 述信息
    private String description;
    // 状态: 0: 禁用  1: 启动
    private Integer status;

    @Override
    public String toString() {
        return "BrandTest{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered='" + ordered + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getOrdered() {
        return ordered;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
