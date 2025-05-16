package ksyun.client.kkms.generatedatakey.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GenerateDataKeyRequest
 * @Description 请求参数
 */
@Data
public class GenerateDataKeyRequest {
    /**
     * 客户主KEY的ID
     */
    @KsYunField(name = "KeyId")
    private String KeyId;

    /**
     * 数据加密密钥（DataKey）的长度。使用AES128生成128位对称密钥，或AES256生成256位对称密钥
     */
    @KsYunField(name = "KeySpec")
    private String KeySpec;

    /**
     * DataKey的长度为字节。例如，使用值64生成512位。数据键（64字节为512位）。对于公共密钥长度（128位和256位对称密钥），我们建议您使用KEYSPEC字段，而不是使用此键字段。
     */
    @KsYunField(name = "NumberOfBytes")
    private Integer NumberOfBytes;

}