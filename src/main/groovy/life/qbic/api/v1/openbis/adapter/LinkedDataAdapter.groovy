package life.qbic.api.v1.openbis.adapter

interface LinkedDataAdapter {

    List<ContentCopyAdapter> getContentCopies()

    String getExternalCode()

    ExternalDmsAdapter getExternalDms()

    LinkedDataFetchOptionsAdapter getFetchOptions()

}