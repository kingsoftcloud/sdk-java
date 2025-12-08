package ksyun.client.iam.updateinstanceprojectid.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateInstanceProjectIdRequest
* @Description 请求参数
*/
@Data
public class UpdateInstanceProjectIdRequest{
    /**ProjectId*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**Action*/
    @KsYunField(name="Action")
    private String Action;

    /**Version*/
    @KsYunField(name="Version")
    private String Version;

}
