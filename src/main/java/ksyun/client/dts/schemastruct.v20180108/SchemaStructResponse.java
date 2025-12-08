package ksyun.client.dts.schemastruct.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SchemaStructResponse
* @Description SchemaStruct 返回体
*/
@Data
@ToString
public class SchemaStructResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Schemas")
        private DataDtoSchemasDto Schemas;

        @Data
        @ToString
        public static class DataDtoSchemasDto {
            /***/
            @JsonProperty("schema")
            private List<DataDtoSchemasDtoSchemaDto> Schema;

            @Data
            @ToString
            public static class DataDtoSchemasDtoSchemaDto {
                /***/
                @JsonProperty("source")
                private String Source;

                /***/
                @JsonProperty("target")
                private String Target;

                /***/
                @JsonProperty("renamable")
                private Boolean Renamable;

                /***/
                @JsonProperty("is_full")
                private Boolean Is_full;

                /***/
                @JsonProperty("children")
                private List<DataDtoSchemasDtoSchemaDtoChildrenDto> Children;

                @Data
                @ToString
                public static class DataDtoSchemasDtoSchemaDtoChildrenDto {
                    /***/
                    @JsonProperty("source")
                    private String Source;

                    /***/
                    @JsonProperty("target")
                    private String Target;

                    /***/
                    @JsonProperty("renamable")
                    private Boolean Renamable;

                    /***/
                    @JsonProperty("is_full")
                    private Boolean Is_full;

                    /***/
                    @JsonProperty("children")
                    private List<DataDtoSchemasDtoSchemaDtoChildrenDtoChildrenDto> Children;

                    @Data
                    @ToString
                    public static class DataDtoSchemasDtoSchemaDtoChildrenDtoChildrenDto {
                        /***/
                        @JsonProperty("source")
                        private String Source;

                        /***/
                        @JsonProperty("target")
                        private String Target;

                        /***/
                        @JsonProperty("renamable")
                        private Boolean Renamable;

                        /***/
                        @JsonProperty("is_full")
                        private Boolean Is_full;

                        /***/
                        @JsonProperty("children")
                        private List<String> Children;

                    }

                }

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
