package ksyun.client.epc.describeremotemanagements.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeRemoteManagementsRequest
* @Description 请求参数
*/
@Data
public class DescribeRemoteManagementsRequest{
    /**远程管理的ID*/
    @KsYunField(name="RemoteManagementId")
    private List<String> RemoteManagementIdList;

}