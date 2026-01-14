package ksyun.client.kec.describesnapshotlist.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSnapshotListRequest
* @Description 请求参数
*/
@Data
public class DescribeSnapshotListRequest{
    /**文件系统实例ID，支持批量查询*/
    @KsYunField(name="FileSystemId",type=1)
    private List<String> FileSystemIdList;

    /**快照ID，支持批量查询*/
    @KsYunField(name="SnapshotId",type=1)
    private List<String> SnapshotIdList;

    /**快照名称*/
    @KsYunField(name="SnapshotName")
    private String SnapshotName;

    /**快照类型。有效取值：
• auto：自动快照
• user：手动创建的快照*/
    @KsYunField(name="SnapshotType")
    private String SnapshotType;

    /**排序规则，CreateTime.desc、CreateTime.asc、ExpireTime.desc、ExpireTime.asc*/
    @KsYunField(name="Sort")
    private String Sort;

    /**页码，默认为1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小，默认为10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
