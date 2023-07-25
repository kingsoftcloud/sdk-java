package ksyun.client.iam.delinstancefromes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DelInstanceFromESRequest
* @Description 请求参数
*/
@Data
public class DelInstanceFromESRequest{
    /***/
    @KsYunField(name="ProductLine")
    private String ProductLine;

    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}