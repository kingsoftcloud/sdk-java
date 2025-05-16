package ksyun.client.milvus.createinstance.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceRequest {
    /**
     * 实例名称
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 管理员账户密码
     */
    @KsYunField(name = "AdminPassword")
    private String AdminPassword;

    /**
     * 子网ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 虚拟网络ID
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 项目id
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 商品类型：现在仅支持容量型
     * PERFORMANCE："性能型"    CAPACITY："容量型"
     */
    @KsYunField(name = "ProductType")
    private String ProductType;

    /**
     * 实例类型：仅支持社区版
     * COMMUNITY 社区版
     * ENTERPRISE 企业版
     */
    @KsYunField(name = "DBInstanceType")
    private String DBInstanceType;

    /**
     * 可用区列表(暂不支持多可用区)
     */
    @KsYunField(name = "Az")
    private List<String> AzList;

    /**
     * 引擎类型
     */
    @KsYunField(name = "Engine")
    private String Engine;

    /**
     * 引擎版本(暂不支持其他版本)
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

    /**
     * 管理员账户
     */
    @KsYunField(name = "AdminUser")
    private String AdminUser;

    /**
     * 配置信息(默认为1cu，若有需求请传入配置)
     */
    @KsYunField(name = "Cu")
    private String Cu;

}