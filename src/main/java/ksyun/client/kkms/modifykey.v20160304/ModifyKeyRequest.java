package ksyun.client.kkms.modifykey.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyKeyRequest
* @Description 请求参数
*/
@Data
public class ModifyKeyRequest{
    /**客户主KEY的ID*/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**客户主KEY的名称*/
    @KsYunField(name="KeyName")
    private String KeyName;

    /**备注*/
    @KsYunField(name="Description")
    private String Description;

}
