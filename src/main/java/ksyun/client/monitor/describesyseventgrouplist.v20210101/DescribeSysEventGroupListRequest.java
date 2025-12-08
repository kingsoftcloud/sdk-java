package ksyun.client.monitor.describesyseventgrouplist.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSysEventGroupListRequest
* @Description 请求参数
*/
@Data
public class DescribeSysEventGroupListRequest{
    /**表示一类云产品，指定命名空间, 示例值：
- KEC: 云服务器
- KS3：对象存储*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**起始时间。

> **Tips**：请注意时间格式为Unix时间戳（毫秒），从1970年1月1日开始所经过的毫秒数。*/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /**结束时间。*/
    @KsYunField(name="EndTime")
    private Integer EndTime;

    /**指定事件名称，多个间以逗号分隔。*/
    @KsYunField(name="EventName")
    private String EventName;

    /**指定实例ID查询事件，多个间以逗号分隔，最多可查询20个实例*/
    @KsYunField(name="InstanceId",type=2)
    private List<String> InstanceIdList;

    /**结果按照事件创建时间排序方式。
- 0：倒序 
- 1：正序*/
    @KsYunField(name="Order")
    private Boolean Order;

    /**页号*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**每页显示的数据行数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
