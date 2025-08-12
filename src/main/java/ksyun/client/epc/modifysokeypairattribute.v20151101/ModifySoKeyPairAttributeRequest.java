package ksyun.client.epc.modifysokeypairattribute.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifySoKeyPairAttributeRequest
 * @Description 请求参数
 */
@Data
public class ModifySoKeyPairAttributeRequest {
    /**
     * 密钥对的描述，默认值为空字符串。
     * • 必须以字母或中文开头。
     * • 只能包含中文、字母、数字、点“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”和中文句号“。”
     * • 长度限制在255个字符以内。
     * • 传入空字符串时，将清空原有描述信息。
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 密钥对唯一ID。
     * • KeyPairName与KeyPairId不允许同时为空。
     * • 如果同时设置了KeyPairName与KeyPairId，则优先生效KeyPairId。
     */
    @KsYunField(name = "KeyPairId")
    private String KeyPairId;

    /**
     * 密钥对名称。
     * • KeyPairName与KeyPairId不允许同时为空。
     * • 如果同时设置了KeyPairName与KeyPairId，则优先生效KeyPairId。
     */
    @KsYunField(name = "KeyPairName")
    private String KeyPairName;

}