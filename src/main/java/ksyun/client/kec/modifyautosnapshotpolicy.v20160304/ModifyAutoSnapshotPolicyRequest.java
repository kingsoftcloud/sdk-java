package ksyun.client.kec.modifyautosnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAutoSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class ModifyAutoSnapshotPolicyRequest{
    /**自动快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**自动快照策略名称,2-64个字符，支持中文、字母、数字以及-_@#.字符*/
    @KsYunField(name="AutoSnapshotPolicyName")
    private String AutoSnapshotPolicyName;

    /**快照创建时间*/
    @KsYunField(name="AutoSnapshotTime")
    private String AutoSnapshotTime;

    /**自动快照重复时间,选定周一到周日中需要创建快照的日期，参数为 1 ~ 7 的数字*/
    @KsYunField(name="AutoSnapshotDate")
    private List<String> AutoSnapshotDateList;

    /**快照类型 LocalSnapshot（极速可用快照）、CommonSnapshot（普通快照）*/
    @KsYunField(name="SnapshotType")
    private String SnapshotType;

    /**自动快照保留时长*/
    @KsYunField(name="RetentionTime")
    private Integer RetentionTime;

}