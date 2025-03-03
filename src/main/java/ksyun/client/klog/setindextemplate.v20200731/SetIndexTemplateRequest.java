package ksyun.client.klog.setindextemplate.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetIndexTemplateRequest
 * @Description 请求参数
 */
@Data
public class SetIndexTemplateRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 日志池名称
     */
    @KsYunField(name = "LogPoolName")
    private String LogPoolName;

    /**
     * 是否启用索引
     */
    @KsYunField(name = "IndexStatus")
    private Boolean IndexStatus;

    /**
     * 全文检索的配置项，包括区分大小写、分词符
     */
    @KsYunField(name = "FullTextIndex")
    private String FullTextIndex;

    /**
     * 字段索引配置项
     */
    @KsYunField(name = "IndexFields")
    private String IndexFields;

    /**
     * true表示索引不区分大小写，false表示索引区分大小写
     */
    @KsYunField(name = "Lowercase")
    private Boolean Lowercase;

    /**
     * 分词符
     */
    @KsYunField(name = "Separator")
    private String Separator;

    /**
     * 字段名称
     */
    @KsYunField(name = "FieldName")
    private String FieldName;

    /**
     * 数据类型,包括text、Int、double、date类型
     */
    @KsYunField(name = "FieldType")
    private String FieldType;

    /**
     * 字段别名
     */
    @KsYunField(name = "FieldAlias")
    private String FieldAlias;

    /**
     * 是否开启分词符
     */
    @KsYunField(name = "SeparatorStatus")
    private Boolean SeparatorStatus;

}