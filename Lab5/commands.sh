docker-compose build

docker-compose up            # Start with logs
docker-compose up -d         # Start in detached (background) mode

docker-compose stop          # Stop running containers
docker-compose down          # Stop and remove containers, networks, images, volumes
docker-compose rm            # Remove stopped containers

docker-compose restart              # Restart all services
docker-compose restart <service>    # Restart a specific service

docker-compose run <service> bash      # Run one-off command (creates new container)
docker-compose exec <service> bash     # Exec into a running container
docker-compose exec <service> <cmd>    # Run command inside running container

docker-compose ps                       # List status of containers
docker-compose logs                     # View logs for all services
docker-compose logs -f <service>        # Follow logs for a service

docker system prune -a             # Remove all unused containers, images, volumes, networks


http://localhost:8088