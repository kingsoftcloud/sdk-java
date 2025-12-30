package ksyun.client.kec.describesnapshotpolicylist.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSnapshotPolicyListRequest
* @Description 请求参数
*/
@Data
public class DescribeSnapshotPolicyListRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**自动快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId",type=1)
    private List<String> AutoSnapshotPolicyIdList;

    /**自动快照策略名称*/
    @KsYunField(name="AutoSnapshotPolicyName")
    private String AutoSnapshotPolicyName;

    /**排序，CreateTime.desc、CreateTime.asc、NextActiveTime.desc、NextActiveTime.asc*/
    @KsYunField(name="Sort")
    private String Sort;

    /**页码，默认为1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小，默认为10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
