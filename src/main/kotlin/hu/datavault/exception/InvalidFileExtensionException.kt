package hu.datavault.exception

class InvalidFileExtensionException(extension: String) : Exception("Invalid file type: .$extension")
