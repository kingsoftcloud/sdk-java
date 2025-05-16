package ksyun.client.ked.clouddeskedit.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CloudDeskeditRequest
 * @Description 请求参数
 */
@Data
public class CloudDeskeditRequest {
    /**
     * 云电脑id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

    /**
     * 自定义云电脑名称
     */
    @KsYunField(name = "name")
    private String Name;

}