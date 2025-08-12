package ksyun.client.epc.createsokeypair.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSoKeyPairRequest
 * @Description 请求参数
 */
@Data
public class CreateSoKeyPairRequest {
    /**
     * 密钥对名称。
     * • 不可与已有名称重复。
     * • 长度限制在 2～64 个字符之间。
     * • 允许使用点号“.”分隔字符成多段，每段允许使用大小写字母、数字或连字符“-”。
     * • 不能以“-”和“.”开头或结尾，不能连续使用“-”或者“.”。
     */
    @KsYunField(name = "KeyPairName")
    private String KeyPairName;

    /**
     * 密钥对的描述，默认值为空字符串。
     * • 必须以字母或中文开头。
     * • 只能包含中文、字母、数字、点“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”和中文句号“。”
     * • 长度限制在255个字符以内。
     */
    @KsYunField(name = "Description")
    private String Description;

}