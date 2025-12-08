package ksyun.client.dts.describesubtask.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSubTaskRequest
* @Description 请求参数
*/
@Data
public class DescribeSubTaskRequest{
    /**主任务ID。须同子任务名称一同填入生效，多用于查询一致性校验子任务列表。*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**子任务ID。选填子任务ID，则查询子任务详情。请务必填写子任务ID与主任务ID其中一个。*/
    @KsYunField(name="SubTaskId")
    private String SubTaskId;

    /**子任务名称。须同主任务ID一同填入生效，多用于查询一致性校验子任务列表。

一致性校验子任务名称：

一致性校验：ConsistencyCheck,用户手工触发一致性校验：UserConsistencyCheck,定时触发一致性校验：FixedConsistencyCheck*/
    @KsYunField(name="SubTaskName")
    private String SubTaskName;

    /**排序方式。查询子任务列表时根据子任务创建时间拍排序,默认DESC*/
    @KsYunField(name="OrderByType")
    private String OrderByType;

    /**子任务table执行状态。查询子任务table迁移详情时可传入。范围：迁移完成：finish 待迁移:unstart  迁移失败:error  迁移中:running  跳过:skip*/
    @KsYunField(name="ObjectStatus")
    private String ObjectStatus;

    /**当前查询开始行数。默认0。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**当前页最大行数。默认10。*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

}
