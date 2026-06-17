from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

# A "Model" for what data we expect from the user
class User(BaseModel):
    name: str
    age: int
    is_active: bool = True

@app.get("/")
def read_root():
    return {"hello": "world"}

@app.get("/test")
def test_page():
    return {"Message": "Welcome to test page!"}

# 1. Path Parameters (Variables in the URL)
@app.get("/users/{user_id}")
def get_user(user_id: int):
    return {"user_id": user_id, "message": f"Fetching data for user number {user_id}"}

# 2. Receiving Data (POST Request with Validation)
@app.post("/users/")
def create_user(user: User):
    return {"message": f"Successfully created user {user.name}!", "received_data": user}
