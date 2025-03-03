package ksyun.client.epc.createkey.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateKeyRequest
 * @Description 请求参数
 */
@Data
public class CreateKeyRequest {
    /**
     * 用户定义的密钥名称
     * 缺省值：Ksc_key
     * 格式：2-128个字符，支持中英文数字特殊符号
     */
    @KsYunField(name = "KeyName")
    private String KeyName;

}