package hu.datavault.exception

class EmptyFileException(fileName: String?) : Exception("Empty file: $fileName")
