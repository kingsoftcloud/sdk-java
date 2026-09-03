package ksyun.client.aicp.createresourcepool.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateResourcePoolRequest
* @Description 请求参数
*/
@Data
public class CreateResourcePoolRequest{
    /**资源组名称*/
    @KsYunField(name="ResourcePoolName")
    private String ResourcePoolName;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

    /**虚拟私有网络ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**资源组类型*/
    @KsYunField(name="ResourcePoolType")
    private String ResourcePoolType;

    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**开启性能型KPFS*/
    @KsYunField(name="EnableKPFSPerformance")
    private Boolean EnableKPFSPerformance;

    /**文件系统id*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**开启Klog*/
    @KsYunField(name="EnableKlog")
    private String EnableKlog;

    /**Klog工程名*/
    @KsYunField(name="LogProjectName")
    private String LogProjectName;

    /**配额超发*/
    @KsYunField(name="Overallocate")
    private Boolean Overallocate;

    /**组件*/
    @KsYunField(name="Components",type=2)
    private List<String> ComponentsList;

    /**是否支持挂载云盘, true代表开启*/
    @KsYunField(name="EnableVolume")
    private Boolean EnableVolume;

    /**云盘计费方式，有效值：
- HourlyInstantSettlement（后付费，按小时实时结算）
- Daily（后付费，按日月结）*/
    @KsYunField(name="VolumeChargeType")
    private String VolumeChargeType;

    /**项目制ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

}
