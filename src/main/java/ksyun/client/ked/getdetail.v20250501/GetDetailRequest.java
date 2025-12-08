package ksyun.client.ked.getdetail.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDetailRequest
* @Description 请求参数
*/
@Data
public class GetDetailRequest{
    /**实例id*/
    @KsYunField(name="instanceId")
    private String InstanceId;

}
