cd back 
./mvnw clean test install
cd ..
docker-compose down
docker-compose build
docker-compose up -d