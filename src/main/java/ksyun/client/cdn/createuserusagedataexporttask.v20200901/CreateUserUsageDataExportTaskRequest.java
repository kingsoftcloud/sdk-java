package ksyun.client.cdn.createuserusagedataexporttask.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateUserUsageDataExportTaskRequest
* @Description 请求参数
*/
@Data
public class CreateUserUsageDataExportTaskRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DD，例如： 2016-08-01*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DD，例如： 2016-08-01*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**当前产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件，*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**任务名称，支持任意任务名称，最大长度256字节*/
    @KsYunField(name="TaskName")
    private String TaskName;

    /**导出文件的语言。zh-cn（默认值）：简体中文。en-us：英文。*/
    @KsYunField(name="Language")
    private String Language;


}