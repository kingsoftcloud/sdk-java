package ksyun.client.mongodb.describeparamgroupinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeParamGroupInfoRequest
 * @Description 请求参数
 */
@Data
public class DescribeParamGroupInfoRequest {
    /**
     * 参数组Id
     */
    @KsYunField(name = "ParamGroupId")
    private String ParamGroupId;

}