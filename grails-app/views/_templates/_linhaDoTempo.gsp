<section class="main-page content user-normal">
    <article class="post main-post user-profile-page">
        <g:each in="${usuario.posts}" var="post">
            ${post.dataDePublicacao}
        </g:each>
    </article>
</section>