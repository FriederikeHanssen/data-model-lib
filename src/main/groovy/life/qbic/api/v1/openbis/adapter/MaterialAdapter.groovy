package life.qbic.api.v1.openbis.adapter

interface MaterialAdapter {

    String getCode()

    MaterialFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    Map<String, MaterialAdapter> getMaterialProperties()

    MaterialAdapter getMaterialProperty(Object propertyName)

    Date getModificationDate()

    MaterialPermIdAdapter getPermId()

    Map<String, String> getProperties()

    String getProperty(Object propertyName)

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    Set<TagAdapter> getTags()

    MaterialTypeAdapter getType()
}