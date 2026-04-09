package ksyun.client.iam.batchupdateinstanceprojectid.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchUpdateInstanceProjectIdRequest
* @Description 请求参数
*/
@Data
public class BatchUpdateInstanceProjectIdRequest{
    /**项目ID*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**实例IDs []string*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
