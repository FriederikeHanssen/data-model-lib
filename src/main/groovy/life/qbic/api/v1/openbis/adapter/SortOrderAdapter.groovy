package life.qbic.api.v1.openbis.adapter

interface SortOrderAdapter {

    def asc()

    def desc()

    boolean isAsc()

    String toString()
}
