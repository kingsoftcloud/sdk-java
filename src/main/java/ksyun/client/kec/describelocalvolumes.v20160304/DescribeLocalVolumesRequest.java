package ksyun.client.kec.describelocalvolumes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLocalVolumesRequest
* @Description 请求参数
*/
@Data
public class DescribeLocalVolumesRequest{
    /**实例名字*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**页数*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页最大条数*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**本地盘id*/
    @KsYunField(name="LocalVolumeId")
    private String LocalVolumeId;

    /**主机状态*/
    @KsYunField(name="InstanceState")
    private String InstanceState;

    /**root/data 磁盘的类型：　系统盘／　数据盘*/
    @KsYunField(name="LocalVolumeCategory")
    private String LocalVolumeCategory;

    /**查询大于等于多少G的磁盘*/
    @KsYunField(name="LocalVolumeSize")
    private Integer LocalVolumeSize;

    /**硬盘是否绑定了备份策略*/
    @KsYunField(name="BindSnapshotPolicy")
    private Boolean BindSnapshotPolicy;

    /**策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}