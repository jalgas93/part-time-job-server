package com.parttime.part_time_jobs.utils

class Constants {
    object Role {
        const val ADMIN = "admin"
        const val MODERATOR = "moderator"
        const val CLIENT = "client"
        const val EMPLOYEES = "employees"
    }

    object Error {
        const val GENERAL_ERROR = "Oh, something went wrong"
        const val WRONG_EMAIL = "wrong email"
        const val INCORRECT_PASSWORD = "incorrect password"
        const val MISSING_FIELDS = "Missing some field!"
        const val USER_NOT_FOUND = "Opps! User not found!"
    }

    object Cards {
        const val CARD_ADDED_SUCCESSFULLY = "Card added successfully!"
        const val CARD_UPDATE_SUCCESSFULLY = "Card updated successfully!"
        const val CARD_DELETED_SUCCESSFULLY = "Card deleted successfully!"
    }
    object UserLocation{
        const val USER_LOCATION_NOT_FOUND = "User location not found!"
        const val USER_LOCATION_ADDED_SUCCESSFULLY = "User location added successfully!"
        const val USER_LOCATION_UPDATED_SUCCESSFULLY = "User location updated successfully!"
        const val USER_LOCATION_DELETED_SUCCESSFULLY = "User location deleted successfully!"
    }

    object Employees{
        const val EMPLOYEE_NOT_FOUND = "Employee not found!"
        const val EMPLOYEE_CREATE = "Create employee successfully!"
        const val EMPLOYEE_UPDATED = "Employee updated successfully!"
        const val EMPLOYEE_DELETED = "Employee deleted successfully!"
        const val ALL_EMPLOYEES = "Get all employees successfully!"
    }
    object User{
        const val GET_ALL_USERS = "Get all users successfully!"
        const val USER_CREATED_SUCCESSFULLY = "User created successfully!"
        const val USER_ALREADY_EXISTS = "User already exists!"
        const val USER_NOT_FOUND = "User not found!"
        const val USER_NOT_FOUND_WITH_ID = "User not found with id: %s"

    }

    object Value {
        const val ID = "id"
    }
}