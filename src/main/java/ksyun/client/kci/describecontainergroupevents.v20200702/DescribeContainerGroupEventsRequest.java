package ksyun.client.kci.describecontainergroupevents.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeContainerGroupEventsRequest
* @Description 请求参数
*/
@Data
public class DescribeContainerGroupEventsRequest{
    /***/
    @KsYunField(name="ContainerGroupId")
    private String ContainerGroupId;

}
