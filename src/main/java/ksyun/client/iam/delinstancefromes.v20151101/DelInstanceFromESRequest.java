package ksyun.client.iam.delinstancefromes.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DelInstanceFromESRequest
 * @Description 请求参数
 */
@Data
public class DelInstanceFromESRequest {
    /***/
    @KsYunField(name = "ProductLine")
    private String ProductLine;

    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}