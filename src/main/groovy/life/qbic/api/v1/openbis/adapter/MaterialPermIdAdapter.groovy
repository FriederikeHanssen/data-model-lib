package life.qbic.api.v1.openbis.adapter

interface MaterialPermIdAdapter {

    boolean equals(Object obj)

    String getCode()

    String getTypeCode()

    int hashCode()

    void setCode(String code)

    void setTypeCode(String typeCode)

    String toString()
}
