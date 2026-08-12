package ksyun.client.kpfs.updatedatamigratetask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDataMigrateTaskRequest
* @Description 请求参数
*/
@Data
public class UpdateDataMigrateTaskRequest{
    /**数据流动任务ID*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**数据流动任务名称，支持1-63字符，仅允许字母、数字和下划线 '_'，必须以字母开头。*/
    @KsYunField(name="TaskName")
    private String TaskName;

    /**完整目录路径，1~950字节，格式：/dir/test/，目录必须存在*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**数据流动策略描述*/
    @KsYunField(name="Description")
    private String Description;

    /**带宽限制，单位MB/s，默认为0，不限制。有效值范围：0~{文件系统吞吐峰值}MB/s，0表示不限制*/
    @KsYunField(name="BandWidthLimit")
    private Integer BandWidthLimit;

    /**迁移完成后，是否删除源的数据。有效值：true，false（默认值）*/
    @KsYunField(name="CleanSourceFile")
    private Boolean CleanSourceFile;

    /**数据流动任务状态，支持周期性任务立即或稍后启用，有效值：on：启用，off：禁用（默认值）*/
    @KsYunField(name="ExportTaskPeriodEnabled")
    private String ExportTaskPeriodEnabled;

    /**仅导出周期任务需要设置*/
    @KsYunField(name="ExportTaskPeriodConfig")
    private ExportTaskPeriodConfigDto ExportTaskPeriodConfig;

    @Data
    @ToString
    public static class ExportTaskPeriodConfigDto {
        /**备份周期。有效值：day：按天（默认值），week：按周，month：按月*/
        @KsYunField(name="FrequencyUnit")
        private String FrequencyUnit;

        /**备份日期。按天不传默认[]，按周（必传）（1-7可多选），按月（必传）（1-31）*/
        @KsYunField(name="IndexOfFrequency",type=2)
        private List<Integer> IndexOfFrequencyList;

        /**时间点（在一天的哪一小时）00: 00，01: 00 ... 默认 00: 00，只支持小时*/
        @KsYunField(name="TimePoints",type=2)
        private List<String> TimePointsList;

    }

}
