package ksyun.client.epc.describeuserdata.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeUserDataRequest
* @Description 请求参数
*/
@Data
public class DescribeUserDataRequest{
    /**实例ID*/
    @KsYunField(name="HostId")
    private String HostId;

}
