package ksyun.client.klog.updatelogpool.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateLogPoolRequest
* @Description 请求参数
*/
@Data
public class UpdateLogPoolRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**日志池ID*/
    @KsYunField(name="LogPoolId")
    private String LogPoolId;

    /**数据保存时间，单位为天，范围1~3600*/
    @KsYunField(name="RetentionDays")
    private Integer RetentionDays;

    /**分区数量*/
    @KsYunField(name="Partitions")
    private Integer Partitions;

    /**日志池描述*/
    @KsYunField(name="Description")
    private String Description;

    /***/
    @KsYunField(name="Config")
    private ConfigDto1 Config;

    @Data
    @ToString
    public static class ConfigDto1 {
        /**字段信息*/
        @KsYunField(name="Columns",type=2)
        private List<ColumnsDto2> ColumnsList;

        @Data
        @ToString
        public static class ColumnsDto2 {
            /**字段ID*/
            @KsYunField(name="Id")
            private String Id;

            /**字段名称*/
            @KsYunField(name="Name")
            private String Name;

            /**字段类型：text|Int|double|bool|date*/
            @KsYunField(name="Type")
            private String Type;

            /**备注*/
            @KsYunField(name="Comment")
            private String Comment;

        }

    }

}
