package ksyun.client.cdn.setcacheruleconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetCacheRuleConfigRequest
* @Description 请求参数
*/
@Data
public class SetCacheRuleConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**由CacheRule组成的数组，表示缓存规则列表。注意：该数组是有序的，优先级按照数组的输入顺序排序，即第一个输入的数组则为最高优先级。*/
    @KsYunField(name="CacheRules",type=2)
    private List<CacheRulesDto> CacheRulesList;

    @Data
    @ToString
    public static class CacheRulesDto {
        /**缓存规则类型*/
        @KsYunField(name="CacheRuleType")
        private String CacheRuleType;

        /**缓存规则的内容；
当缓存规则类型为目录时，目录必须以/开头且以/结尾，允许多个输入，多个目录以逗号（半角）间隔；
当缓存规则类型为全路径时，全路径需输入完整路径，且必须以/开头；
当缓存规则为文件后缀时，允许多个输入，文件后缀必须输入文件后缀名，多个文件后缀名以逗号（半角）间隔；
当CacheRuleType的值为 exact（全路径 ）时，Value可以直接输入 / 表示一个完整路径，而非一个目录；*/
        @KsYunField(name="Value")
        private String Value;

        /**配置缓存功能的开启或关闭，对应缓存/不缓存 取值：on、off ，默认为on 。配置on时，下面 CacheTime 为必选项，RespectOrigin为可选项；配置off时，下面 CacheTime 、RespectOrigin都为不可选项*/
        @KsYunField(name="CacheEnable")
        private String CacheEnable;

        /**缓存时间，以秒为单位。当CacheEnable = on时，为必选项*/
        @KsYunField(name="CacheTime")
        private Long CacheTime;

        /**是否遵循源站，off表示不遵循，on表示遵循，默认为遵循。*/
        @KsYunField(name="RespectOrigin")
        private String RespectOrigin;

    }

}
