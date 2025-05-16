package ksyun.client.kkms.createkey.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateKeyRequest
 * @Description 请求参数
 */
@Data
public class CreateKeyRequest {
    /**
     * 客户主KEY的名称
     */
    @KsYunField(name = "KeyName")
    private String KeyName;

    /**
     * 备注
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 客户主KEY的用途，仅可用于对称加密和解密
     */
    @KsYunField(name = "KeyUsage")
    private String KeyUsage;

    /**
     * 客户的主KEY的来源
     */
    @KsYunField(name = "Origin")
    private String Origin;

    /**
     * KKMS的计费类型
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

}