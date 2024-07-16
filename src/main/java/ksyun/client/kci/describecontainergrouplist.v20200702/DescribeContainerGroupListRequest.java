package ksyun.client.kci.describecontainergrouplist.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeContainerGroupListRequest
* @Description 请求参数
*/
@Data
public class DescribeContainerGroupListRequest{
    /**请求Action*/
    @KsYunField(name="Action")
    private String Action;


}