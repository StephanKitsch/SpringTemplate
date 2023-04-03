# SpringTemplate

## Installation

Build l'application en exécutant la commande `mvn clean package -DskipTests`.

Créer une image docker de l'application à l'aide de la commande docker `docker build . -t spring_template_image`.

Ensuite exécuter cette image dans un conteneur en lançant la commande `docker run -p 9090:8080 spring_template_image`.
